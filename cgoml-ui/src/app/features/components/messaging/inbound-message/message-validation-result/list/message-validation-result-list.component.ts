import { ActivatedRoute } from '@angular/router';
import { Component, OnInit, AfterViewInit, ViewChild } from '@angular/core';
import { ConfirmationModalComponent } from 'src/app/core/components/confirmation-modal/confirmation-modal.component';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { InboundMessageRestClient } from 'src/app/features/services/messaging/InboundMessageRestClient';
import { MatDialog } from '@angular/material/dialog';
import { MatPaginator } from '@angular/material/paginator';
import { MatSort } from '@angular/material/sort';
import { MatTableDataSource } from '@angular/material/table';
import { MessageValidationResultBasicView } from 'src/app/features/models/messaging/views/basic/MessageValidationResultBasicView';
import { MessageValidationResultFilter } from 'src/app/features/models/messaging/filters/MessageValidationResultFilter';
import { MessageValidationResultForm } from 'src/app/features/models/messaging/forms/MessageValidationResultForm';
import { MessageValidationResultFullView } from 'src/app/features/models/messaging/views/full/MessageValidationResultFullView';
import { MessageValidationResultModalComponent } from './../modal/message-validation-result-modal.component';
import { MessageValidationResultSorting } from 'src/app/features/models/messaging/sortings/MessageValidationResultSorting';
import { NavLink } from 'src/app/core/models/nav-link';
import { NotificationService } from 'src/app/core/services/NotificationService';
import { ScrollForm } from "src/app/core/models/ScrollForm";
import { ScrollView } from "src/app/core/models/ScrollView";
import { SelectItem } from "src/app/core/models/SelectItem";
import { StringUtils } from 'src/app/core/services/StringUtils';
/**
 * auto generated one to many component list component ts file
 * <br/>write modifications between specific code marks
 * <br/>processed by skeleton-generator
 */

@Component({
selector: 'app-message-validation-result-list',
templateUrl: './message-validation-result-list.component.html',
styleUrls: ['./message-validation-result-list.component.scss']
})
export class MessageValidationResultListComponent implements OnInit, AfterViewInit {

id:number;
activePath:string;
scrollForm: ScrollForm<MessageValidationResultFilter, MessageValidationResultSorting> = new ScrollForm();
scrollView: ScrollView<MessageValidationResultBasicView> = new ScrollView();
dataSource:MatTableDataSource<MessageValidationResultBasicView>;
@ViewChild(MatPaginator) paginator: MatPaginator;
@ViewChild(MatSort) sort: MatSort
pageSizeOptions: number[] = [10, 20, 50, 100];
displayedColumns: string[] = ['level','mipCode','description','Actions'];
filter: FormGroup;

constructor(private service:InboundMessageRestClient, private route: ActivatedRoute, private formBuilder: FormBuilder, private dialog: MatDialog, private notifications: NotificationService) {
this.id = parseInt(this.route.snapshot.paramMap.get('id'));
this.activePath = '/inbound-message/' + this.id.toString() + '/message-validation-result/list';
}
ngOnInit(): void {
this.filter = this.formBuilder.group({
level:[null],
mipCode:[null],
description:[null]})
this.reset();
}

ngAfterViewInit(): void {
this.paginator.page.subscribe(
(event) => {
this.scrollForm.page=event.pageIndex+1;
this.scrollForm.elementsPerPage=event.pageSize;
this.refresh();
});

this.sort.sortChange.subscribe(
(event) => {
this.scrollForm.sorting = new MessageValidationResultSorting();
switch (this.sort.active) {
case 'level': this.scrollForm.sorting.levelOrderType = StringUtils.emptyToNull(this.sort.direction.toUpperCase());break;
case 'mipCode': this.scrollForm.sorting.mipCodeOrderType = StringUtils.emptyToNull(this.sort.direction.toUpperCase());break;
case 'description': this.scrollForm.sorting.descriptionOrderType = StringUtils.emptyToNull(this.sort.direction.toUpperCase());break;
}
this.refresh();
});

this.filter.controls['level'].valueChanges.subscribe(value=>{
this.scrollForm.filter.level=value;
this.refresh();
});
this.filter.controls['mipCode'].valueChanges.subscribe(value=>{
this.scrollForm.filter.mipCode=value;
this.refresh();
});
this.filter.controls['description'].valueChanges.subscribe(value=>{
this.scrollForm.filter.description=value;
this.refresh();
});
}

refresh(): void {
this.service.scrollMessageValidationResult(this.id, this.scrollForm).subscribe((t) => {
this.scrollView=t;
this.dataSource = new MatTableDataSource(this.scrollView.elements);
});
}

reset(): void {
this.scrollForm = new ScrollForm();
this.scrollForm.filter = new MessageValidationResultFilter();
this.scrollForm.sorting = new MessageValidationResultSorting();
this.scrollForm.page=1;
this.scrollForm.elementsPerPage=10;
this.filter.patchValue({
level: [null],
mipCode: [null],
description: [null]
})
this.refresh();
}

create(): void {
this.service.createMessageValidationResult(this.id).subscribe((t) => {
let ref = this.dialog.open(MessageValidationResultModalComponent);
ref.componentInstance.view = t;
ref.componentInstance.parentId = this.id;
ref.afterClosed().subscribe(result => {this.refresh();});
});
}

edit(id: number): void {
this.service.loadMessageValidationResult(id).subscribe((t) => {
let ref = this.dialog.open(MessageValidationResultModalComponent);
ref.componentInstance.view = t;
ref.afterClosed().subscribe(result => {this.refresh();});
});
}

delete(id: number): void {
this.dialog.open(ConfirmationModalComponent).afterClosed().subscribe(result => {
if (result) {
this.service.deleteMessageValidationResult(id).subscribe(success => {this.notifications.info("Operation completed");this.refresh()}, error => {this.notifications.error("Operation failed")});
}
});
}

/* Specific Code Start */
/* Specific Code End */
}
