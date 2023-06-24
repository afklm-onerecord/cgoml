import { ActivatedRoute } from '@angular/router';
import { Component, OnInit, ViewChild } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { InboundMessageFullView } from 'src/app/features/models/messaging/views/full/InboundMessageFullView';
import { InboundMessageRestClient } from 'src/app/features/services/messaging/InboundMessageRestClient';
import { NavLink } from 'src/app/core/models/nav-link';
import { NotificationService } from 'src/app/core/services/NotificationService';
import { Observable } from 'rxjs';
import { SelectItem } from 'src/app/core/models/SelectItem';
import { StringUtils } from 'src/app/core/services/StringUtils';
/**
 * auto generated details component ts file
 * <br/>write modifications between specific code marks
 * <br/>processed by skeleton-generator
 */

@Component({
selector: 'app-inbound-message-details',
templateUrl: './inbound-message-details.component.html',
styleUrls: ['./inbound-message-details.component.scss']
})
export class InboundMessageDetailsComponent implements OnInit {

id:number;
activePath:string;
view: InboundMessageFullView = new InboundMessageFullView();
form: FormGroup;

constructor(private service:InboundMessageRestClient, private route: ActivatedRoute, private formBuilder: FormBuilder, private notifications: NotificationService) {
this.id = parseInt(this.route.snapshot.paramMap.get('id'));
this.activePath = '/inbound-message/' + this.id.toString();
}

ngOnInit(): void {
this.form = this.formBuilder.group({
uuid:[null, Validators.required],
receptionDate:[null, Validators.required],
messageType:[null],
content:[null],
status:[null]})
this.load();
}
restoreForm(): void {
this.form.patchValue({
uuid: this.view.form.uuid,
receptionDate: this.view.form.receptionDate,
messageType: this.view.form.messageType,
content: this.view.form.content,
status: this.view.form.status
})
}

applyForm(): void {
this.view.form.uuid = StringUtils.emptyToNull(this.form.get('uuid').value);
this.view.form.receptionDate = StringUtils.emptyToNull(this.form.get('receptionDate').value);
this.view.form.messageType = StringUtils.emptyToNull(this.form.get('messageType').value);
this.view.form.content = StringUtils.emptyToNull(this.form.get('content').value);
this.view.form.status = StringUtils.emptyToNull(this.form.get('status').value);
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
