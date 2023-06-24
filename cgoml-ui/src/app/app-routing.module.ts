import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
/**
 * auto generated app routing module ts file
 * <br/>write modifications between specific code marks
 * <br/>processed by skeleton-generator
 */

const routes: Routes = [
{path:'inbound-message', loadChildren:()=>import('src/app/features/components/messaging/inbound-message/inbound-message.module').then(m=>m.InboundMessageModule) }
,{path:'outbound-message', loadChildren:()=>import('src/app/features/components/messaging/outbound-message/outbound-message.module').then(m=>m.OutboundMessageModule) }
/* Specific Code Start */

/* Specific Code End */
];

@NgModule({
imports: [RouterModule.forRoot(routes)],
exports: [RouterModule]
})
export class AppRoutingModule { }
