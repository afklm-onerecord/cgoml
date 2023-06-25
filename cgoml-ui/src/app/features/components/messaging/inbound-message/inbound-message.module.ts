import { CommonModule } from '@angular/common';
import { InboundMessageDetailsComponent } from './details/inbound-message-details.component';
import { InboundMessageListComponent } from './list/inbound-message-list.component';
import { InboundMessageMenuComponent } from './menu/inbound-message-menu.component';
import { InboundMessageModalComponent } from './modal/inbound-message-modal.component';
import { InboundMessageRoutingModule } from './inbound-message-routing.module';
import { MessageValidationResultListComponent } from './message-validation-result/list/message-validation-result-list.component';
import { MessageValidationResultModalComponent } from './message-validation-result/modal/message-validation-result-modal.component';
import { NgModule } from '@angular/core';
import { SharedModule } from 'src/app/shared/shared.module';
/**
 * auto generated list module ts file
 * <br/>write modifications between specific code marks
 * <br/>processed by skeleton-generator
 */

@NgModule({
declarations: [InboundMessageListComponent,InboundMessageDetailsComponent, InboundMessageModalComponent, InboundMessageMenuComponent, MessageValidationResultListComponent, MessageValidationResultModalComponent],
imports: [CommonModule, SharedModule, InboundMessageRoutingModule]
})
export class InboundMessageModule { }
