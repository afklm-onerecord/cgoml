import { HttpClient, HttpHeaders} from '@angular/common/http';
import { InboundMessageBasicView } from 'src/app/features/models/messaging/views/basic/InboundMessageBasicView';
import { InboundMessageFilter } from 'src/app/features/models/messaging/filters/InboundMessageFilter';
import { InboundMessageForm } from 'src/app/features/models/messaging/forms/InboundMessageForm';
import { InboundMessageFullView } from 'src/app/features/models/messaging/views/full/InboundMessageFullView';
import { InboundMessageSorting } from 'src/app/features/models/messaging/sortings/InboundMessageSorting';
import { Injectable } from '@angular/core';
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
export class InboundMessageRestClient {

private httpOptions = {headers:new HttpHeaders({'Content-Type':'application/json'})};

constructor(private http: HttpClient) { }
/**
 * load object list
 */
public loadList() {
return this.http.get<InboundMessageBasicView[]>(environment.restApiUrl + '/inbound-message/list');
}

/**
 * scroll object list
 */
public scroll(form: ScrollForm<InboundMessageFilter, InboundMessageSorting>) {
return this.http.post<ScrollView<InboundMessageBasicView>>(environment.restApiUrl + '/inbound-message/scroll', form, this.httpOptions);
}

/**
 * load object
 */
public load(id:number) {
return this.http.get<InboundMessageFullView>(environment.restApiUrl + '/inbound-message/' + id);
}

/**
 * create object
 */
public create() {
return this.http.get<InboundMessageFullView>(environment.restApiUrl + '/inbound-message/new');
}

/**
 * save object
 */
public save(form: InboundMessageForm) {
return this.http.post<number>(environment.restApiUrl + '/inbound-message', form, this.httpOptions);
}

/**
 * update object
 */
public update(id: number, form: InboundMessageForm) {
return this.http.put(environment.restApiUrl + '/inbound-message/' + id, form, this.httpOptions);
}

/**
 * delete object
 */
public delete(id: number) {
return this.http.delete(environment.restApiUrl + '/inbound-message/' + id);
}


/* Specific Code Start */
/* Specific Code End */

}
