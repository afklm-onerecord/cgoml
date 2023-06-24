import { Component, OnInit, ViewChild } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { InboundMessageFullView } from 'src/app/features/models/messaging/views/full/InboundMessageFullView';
import { InboundMessageRestClient } from 'src/app/features/services/messaging/InboundMessageRestClient';
import { MatDialogRef } from '@angular/material/dialog';
import { NotificationService } from 'src/app/core/services/NotificationService';
import { Observable } from 'rxjs';
import { SelectItem } from 'src/app/core/models/SelectItem';
import { StringUtils } from 'src/app/core/services/StringUtils';
/**
 * auto generated modal component ts file
 * <br/>write modifications between specific code marks
 * <br/>processed by skeleton-generator
 */

@Component({
selector: 'app-inbound-message-modal',
templateUrl: './inbound-message-modal.component.html',
styleUrls: ['./inbound-message-modal.component.scss']
})
export class InboundMessageModalComponent implements OnInit {

view: InboundMessageFullView;
form: FormGroup;

constructor(private service:InboundMessageRestClient, private formBuilder: FormBuilder, private notifications: NotificationService, private dialogRef: MatDialogRef<InboundMessageModalComponent>) {}

ngOnInit(): void {
this.form = this.formBuilder.group({
uuid:[null, Validators.required],
receptionDate:[null, Validators.required],
messageType:[null],
content:[null],
status:[null]});
this.restoreForm();
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

save(): void {
this.applyForm();
this.service.save(this.view.form).subscribe(success => {this.notifications.info("Operation completed");this.dialogRef.close();}, error => {this.notifications.error("Operation failed")});
}

update(): void {
this.applyForm();
this.service.update(this.view.id, this.view.form).subscribe(success => {this.notifications.info("Operation completed");this.dialogRef.close();}, error => {this.notifications.error("Operation failed")});
}

saveOrUpdate(): void {
if (this.view.id == null) {this.save()} else {this.update()}
}

/* Specific Code Start */
/* Specific Code End */
}
