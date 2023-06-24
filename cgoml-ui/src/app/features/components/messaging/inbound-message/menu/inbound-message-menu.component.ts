import { Component, Input, OnInit } from '@angular/core';
import { NavLink } from 'src/app/core/models/nav-link';
/**
 * auto generated menu component ts file
 * <br/>write modifications between specific code marks
 * <br/>processed by skeleton-generator
 */

@Component({
selector: 'app-inbound-message-menu',
templateUrl: './inbound-message-menu.component.html',
styleUrls: ['./inbound-message-menu.component.scss']
})
export class InboundMessageMenuComponent implements OnInit {

links:NavLink[];
@Input() id:number;
@Input() activePath:string;

ngOnInit(): void {
this.links=[{text:'Details',path:'/inbound-message/' + this.id.toString()}];
}
}
