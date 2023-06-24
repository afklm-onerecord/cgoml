import { Component, OnInit, AfterViewInit, ViewChild } from '@angular/core';
import { ConfirmationModalComponent } from 'src/app/core/components/confirmation-modal/confirmation-modal.component';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { MatDialog } from '@angular/material/dialog';
import { MatPaginator } from '@angular/material/paginator';
import { MatSort } from '@angular/material/sort';
import { MatTableDataSource } from '@angular/material/table';
import { NotificationService } from 'src/app/core/services/NotificationService';
import { OutboundMessageBasicView } from 'src/app/features/models/messaging/views/basic/OutboundMessageBasicView';
import { OutboundMessageFilter } from 'src/app/features/models/messaging/filters/OutboundMessageFilter';
import { OutboundMessageForm } from 'src/app/features/models/messaging/forms/OutboundMessageForm';
import { OutboundMessageFullView } from 'src/app/features/models/messaging/views/full/OutboundMessageFullView';
import { OutboundMessageModalComponent } from './../modal/outbound-message-modal.component';
import { OutboundMessageRestClient } from 'src/app/features/services/messaging/OutboundMessageRestClient';
import { OutboundMessageSorting } from 'src/app/features/models/messaging/sortings/OutboundMessageSorting';
import { ScrollForm } from "src/app/core/models/ScrollForm";
import { ScrollView } from "src/app/core/models/ScrollView";
import { SelectItem } from "src/app/core/models/SelectItem";
import { StringUtils } from 'src/app/core/services/StringUtils';
/**
 * auto generated list component ts file
 * <br/>write modifications between specific code marks
 * <br/>processed by skeleton-generator
 */

@Component({
selector: 'app-outbound-message-list',
templateUrl: './outbound-message-list.component.html',
styleUrls: ['./outbound-message-list.component.scss']
})
export class OutboundMessageListComponent implements OnInit, AfterViewInit {

scrollForm: ScrollForm<OutboundMessageFilter, OutboundMessageSorting> = new ScrollForm();
scrollView: ScrollView<OutboundMessageBasicView> = new ScrollView();
dataSource:MatTableDataSource<OutboundMessageBasicView>;
@ViewChild(MatPaginator) paginator: MatPaginator;
@ViewChild(MatSort) sort: MatSort
pageSizeOptions: number[] = [10, 20, 50, 100];
displayedColumns: string[] = ['uuid','receptionDate','messageType','Actions'];
filter: FormGroup;

constructor(private service:OutboundMessageRestClient, private formBuilder: FormBuilder, private dialog: MatDialog, private notifications: NotificationService) { }
ngOnInit(): void {
this.filter = this.formBuilder.group({
uuid:[null],
receptionDateMinValue:[null],
receptionDateMaxValue:[null],
messageType:[null]})
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
this.scrollForm.sorting = new OutboundMessageSorting();
switch (this.sort.active) {
case 'uuid': this.scrollForm.sorting.uuidOrderType = StringUtils.emptyToNull(this.sort.direction.toUpperCase());break;
case 'receptionDate': this.scrollForm.sorting.receptionDateOrderType = StringUtils.emptyToNull(this.sort.direction.toUpperCase());break;
case 'messageType': this.scrollForm.sorting.messageTypeOrderType = StringUtils.emptyToNull(this.sort.direction.toUpperCase());break;
}
this.refresh();
});

this.filter.controls['uuid'].valueChanges.subscribe(value=>{
this.scrollForm.filter.uuid=value;
this.refresh();
});
this.filter.controls['receptionDateMinValue'].valueChanges.subscribe(value=>{
this.scrollForm.filter.receptionDateMinValue=value;
this.refresh();
});
this.filter.controls['receptionDateMaxValue'].valueChanges.subscribe(value=>{
this.scrollForm.filter.receptionDateMaxValue=value;
this.refresh();
});
this.filter.controls['messageType'].valueChanges.subscribe(value=>{
this.scrollForm.filter.messageType=value;
this.refresh();
});
}

refresh(): void {
this.service.scroll(this.scrollForm).subscribe((t) => {
this.scrollView=t;
this.dataSource = new MatTableDataSource(this.scrollView.elements);
});
}

reset(): void {
this.scrollForm = new ScrollForm();
this.scrollForm.filter = new OutboundMessageFilter();
this.scrollForm.sorting = new OutboundMessageSorting();
this.scrollForm.page=1;
this.scrollForm.elementsPerPage=10;
this.filter.patchValue({
uuid: [null],
receptionDateMinValue: [null],
receptionDateMaxValue: [null],
messageType: [null]
})
this.refresh();
}

create(): void {
this.service.create().subscribe((t) => {
let ref = this.dialog.open(OutboundMessageModalComponent);
ref.componentInstance.view = t;
ref.afterClosed().subscribe(result => {this.refresh();});
});
}

edit(id: number): void {
this.service.load(id).subscribe((t) => {
let ref = this.dialog.open(OutboundMessageModalComponent);
ref.componentInstance.view = t;
ref.afterClosed().subscribe(result => {this.refresh();});
});
}

delete(id: number): void {
this.dialog.open(ConfirmationModalComponent).afterClosed().subscribe(result => {
if (result) {
this.service.delete(id).subscribe(success => {this.notifications.info("Operation completed");this.refresh()}, error => {this.notifications.error("Operation failed")});
}
});
}

/* Specific Code Start */
/* Specific Code End */
}
