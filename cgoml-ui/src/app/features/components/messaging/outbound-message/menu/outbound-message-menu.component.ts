import { Component, Input, OnInit } from '@angular/core';
import { NavLink } from 'src/app/core/models/nav-link';
/**
 * auto generated menu component ts file
 * <br/>write modifications between specific code marks
 * <br/>processed by skeleton-generator
 */

@Component({
selector: 'app-outbound-message-menu',
templateUrl: './outbound-message-menu.component.html',
styleUrls: ['./outbound-message-menu.component.scss']
})
export class OutboundMessageMenuComponent implements OnInit {

links:NavLink[];
@Input() id:number;
@Input() activePath:string;

ngOnInit(): void {
this.links=[{text:'Details',path:'/outbound-message/' + this.id.toString()}];
}
}
