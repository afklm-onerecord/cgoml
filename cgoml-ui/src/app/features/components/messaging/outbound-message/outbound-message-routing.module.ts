import { NgModule } from '@angular/core';
import { OutboundMessageDetailsComponent } from './details/outbound-message-details.component';
import { OutboundMessageListComponent } from './list/outbound-message-list.component';
import { RouterModule, Routes } from '@angular/router';
/**
 * auto generated list routing module ts file
 * <br/>write modifications between specific code marks
 * <br/>processed by skeleton-generator
 */

const routes: Routes = [
{path: 'list', component: OutboundMessageListComponent }
,{path: ':id', component: OutboundMessageDetailsComponent }
];

@NgModule({
imports: [RouterModule.forChild(routes)],
exports: [RouterModule]
})
export class OutboundMessageRoutingModule { }
