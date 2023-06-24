import { InboundMessageDetailsComponent } from './details/inbound-message-details.component';
import { InboundMessageListComponent } from './list/inbound-message-list.component';
import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
/**
 * auto generated list routing module ts file
 * <br/>write modifications between specific code marks
 * <br/>processed by skeleton-generator
 */

const routes: Routes = [
{path: 'list', component: InboundMessageListComponent }
,{path: ':id', component: InboundMessageDetailsComponent }
];

@NgModule({
imports: [RouterModule.forChild(routes)],
exports: [RouterModule]
})
export class InboundMessageRoutingModule { }
