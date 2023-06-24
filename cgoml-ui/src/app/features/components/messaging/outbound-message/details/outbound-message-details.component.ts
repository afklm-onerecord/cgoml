import { ActivatedRoute } from '@angular/router';
import { Component, OnInit, ViewChild } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { NavLink } from 'src/app/core/models/nav-link';
import { NotificationService } from 'src/app/core/services/NotificationService';
import { Observable } from 'rxjs';
import { OutboundMessageFullView } from 'src/app/features/models/messaging/views/full/OutboundMessageFullView';
import { OutboundMessageRestClient } from 'src/app/features/services/messaging/OutboundMessageRestClient';
import { SelectItem } from 'src/app/core/models/SelectItem';
import { StringUtils } from 'src/app/core/services/StringUtils';
/**
 * auto generated details component ts file
 * <br/>write modifications between specific code marks
 * <br/>processed by skeleton-generator
 */

@Component({
selector: 'app-outbound-message-details',
templateUrl: './outbound-message-details.component.html',
styleUrls: ['./outbound-message-details.component.scss']
})
export class OutboundMessageDetailsComponent implements OnInit {

id:number;
activePath:string;
view: OutboundMessageFullView = new OutboundMessageFullView();
form: FormGroup;

constructor(private service:OutboundMessageRestClient, private route: ActivatedRoute, private formBuilder: FormBuilder, private notifications: NotificationService) {
this.id = parseInt(this.route.snapshot.paramMap.get('id'));
this.activePath = '/outbound-message/' + this.id.toString();
}

ngOnInit(): void {
this.form = this.formBuilder.group({
uuid:[null, Validators.required],
receptionDate:[null, Validators.required],
messageType:[null],
content:[null]})
this.load();
}
restoreForm(): void {
this.form.patchValue({
uuid: this.view.form.uuid,
receptionDate: this.view.form.receptionDate,
messageType: this.view.form.messageType,
content: this.view.form.content
})
}

applyForm(): void {
this.view.form.uuid = StringUtils.emptyToNull(this.form.get('uuid').value);
this.view.form.receptionDate = StringUtils.emptyToNull(this.form.get('receptionDate').value);
this.view.form.messageType = StringUtils.emptyToNull(this.form.get('messageType').value);
this.view.form.content = StringUtils.emptyToNull(this.form.get('content').value);
}

load(): void {
this.service.load(this.id).subscribe((t) => {this.view=t;this.restoreForm();});
}

update(): void {
this.applyForm();
this.service.update(this.id, this.view.form).subscribe(success => {this.notifications.info("Operation completed");this.load();}, error => {this.notifications.error("Operation failed")});
}
/* Specific Code Start */
/* Specific Code End */
}
