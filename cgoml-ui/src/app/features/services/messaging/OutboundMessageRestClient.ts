import { HttpClient, HttpHeaders} from '@angular/common/http';
import { Injectable } from '@angular/core';
import { OutboundMessageBasicView } from 'src/app/features/models/messaging/views/basic/OutboundMessageBasicView';
import { OutboundMessageFilter } from 'src/app/features/models/messaging/filters/OutboundMessageFilter';
import { OutboundMessageForm } from 'src/app/features/models/messaging/forms/OutboundMessageForm';
import { OutboundMessageFullView } from 'src/app/features/models/messaging/views/full/OutboundMessageFullView';
import { OutboundMessageSorting } from 'src/app/features/models/messaging/sortings/OutboundMessageSorting';
import { ScrollForm } from 'src/app/core/models/ScrollForm';
import { ScrollView } from 'src/app/core/models/ScrollView';
import { SelectItem } from 'src/app/core/models/SelectItem';
import { environment } from 'src/environments/environment';

/**
 * auto generated rest client ts file
 * <br/>no modification should be done to this file
 * <br/>processed by skeleton-generator
 */
@Injectable({providedIn:'root'})
export class OutboundMessageRestClient {

private httpOptions = {headers:new HttpHeaders({'Content-Type':'application/json'})};

constructor(private http: HttpClient) { }
/**
 * load object list
 */
public loadList() {
return this.http.get<OutboundMessageBasicView[]>(environment.restApiUrl + '/outbound-message/list');
}

/**
 * scroll object list
 */
public scroll(form: ScrollForm<OutboundMessageFilter, OutboundMessageSorting>) {
return this.http.post<ScrollView<OutboundMessageBasicView>>(environment.restApiUrl + '/outbound-message/scroll', form, this.httpOptions);
}

/**
 * load object
 */
public load(id:number) {
return this.http.get<OutboundMessageFullView>(environment.restApiUrl + '/outbound-message/' + id);
}

/**
 * create object
 */
public create() {
return this.http.get<OutboundMessageFullView>(environment.restApiUrl + '/outbound-message/new');
}

/**
 * save object
 */
public save(form: OutboundMessageForm) {
return this.http.post<number>(environment.restApiUrl + '/outbound-message', form, this.httpOptions);
}

/**
 * update object
 */
public update(id: number, form: OutboundMessageForm) {
return this.http.put(environment.restApiUrl + '/outbound-message/' + id, form, this.httpOptions);
}

/**
 * delete object
 */
public delete(id: number) {
return this.http.delete(environment.restApiUrl + '/outbound-message/' + id);
}


/* Specific Code Start */
/* Specific Code End */

}
