import { Component, OnInit, ViewChild } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { InboundMessageRestClient } from 'src/app/features/services/messaging/InboundMessageRestClient';
import { MatDialogRef } from '@angular/material/dialog';
import { MessageValidationResultFullView } from 'src/app/features/models/messaging/views/full/MessageValidationResultFullView';
import { NotificationService } from 'src/app/core/services/NotificationService';
import { Observable } from 'rxjs';
import { SelectItem } from 'src/app/core/models/SelectItem';
import { StringUtils } from 'src/app/core/services/StringUtils';
/**
 * auto generated one to many component modal component ts file
 * <br/>write modifications between specific code marks
 * <br/>processed by skeleton-generator
 */

@Component({
selector: 'app-message-validation-result-modal',
templateUrl: './message-validation-result-modal.component.html',
styleUrls: ['./message-validation-result-modal.component.scss']
})
export class MessageValidationResultModalComponent implements OnInit {

parentId: number;
view: MessageValidationResultFullView;
form: FormGroup;

constructor(private service:InboundMessageRestClient, private formBuilder: FormBuilder, private notifications: NotificationService, private dialogRef: MatDialogRef<MessageValidationResultModalComponent>) {}

ngOnInit(): void {
this.form = this.formBuilder.group({
level:[null],
mipCode:[null],
description:[null]});
this.restoreForm();
}
restoreForm(): void {
this.form.patchValue({
level: this.view.form.level,
mipCode: this.view.form.mipCode,
description: this.view.form.description
})
}

applyForm(): void {
this.view.form.level = StringUtils.emptyToNull(this.form.get('level').value);
this.view.form.mipCode = StringUtils.emptyToNull(this.form.get('mipCode').value);
this.view.form.description = StringUtils.emptyToNull(this.form.get('description').value);
}

save(): void {
this.applyForm();
this.service.saveMessageValidationResult(this.parentId, this.view.form).subscribe(success => {this.notifications.info("Operation completed");this.dialogRef.close();}, error => {this.notifications.error("Operation failed")});
}

update(): void {
this.applyForm();
this.service.updateMessageValidationResult(this.view.id, this.view.form).subscribe(success => {this.notifications.info("Operation completed");this.dialogRef.close();}, error => {this.notifications.error("Operation failed")});
}

saveOrUpdate(): void {
if (this.view.id == null) {this.save()} else {this.update()}
}

/* Specific Code Start */
/* Specific Code End */
}
