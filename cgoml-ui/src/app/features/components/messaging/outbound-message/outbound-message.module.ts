import { CommonModule } from '@angular/common';
import { NgModule } from '@angular/core';
import { OutboundMessageDetailsComponent } from './details/outbound-message-details.component';
import { OutboundMessageListComponent } from './list/outbound-message-list.component';
import { OutboundMessageMenuComponent } from './menu/outbound-message-menu.component';
import { OutboundMessageModalComponent } from './modal/outbound-message-modal.component';
import { OutboundMessageRoutingModule } from './outbound-message-routing.module';
import { SharedModule } from 'src/app/shared/shared.module';
/**
 * auto generated list module ts file
 * <br/>write modifications between specific code marks
 * <br/>processed by skeleton-generator
 */

@NgModule({
declarations: [OutboundMessageListComponent,OutboundMessageDetailsComponent, OutboundMessageModalComponent, OutboundMessageMenuComponent],
imports: [CommonModule, SharedModule, OutboundMessageRoutingModule]
})
export class OutboundMessageModule { }
