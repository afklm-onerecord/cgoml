import { HttpClient, HttpHeaders} from '@angular/common/http';
import { InboundMessageBasicView } from 'src/app/features/models/messaging/views/basic/InboundMessageBasicView';
import { InboundMessageFilter } from 'src/app/features/models/messaging/filters/InboundMessageFilter';
import { InboundMessageForm } from 'src/app/features/models/messaging/forms/InboundMessageForm';
import { InboundMessageFullView } from 'src/app/features/models/messaging/views/full/InboundMessageFullView';
import { InboundMessageSorting } from 'src/app/features/models/messaging/sortings/InboundMessageSorting';
import { Injectable } from '@angular/core';
import { MessageValidationResultBasicView } from 'src/app/features/models/messaging/views/basic/MessageValidationResultBasicView';
import { MessageValidationResultFilter } from 'src/app/features/models/messaging/filters/MessageValidationResultFilter';
import { MessageValidationResultForm } from 'src/app/features/models/messaging/forms/MessageValidationResultForm';
import { MessageValidationResultFullView } from 'src/app/features/models/messaging/views/full/MessageValidationResultFullView';
import { MessageValidationResultSorting } from 'src/app/features/models/messaging/sortings/MessageValidationResultSorting';
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
 * load one to many component messageValidationResult list
 */
public loadMessageValidationResultList(id:number) {
return this.http.get<MessageValidationResultBasicView[]>(environment.restApiUrl + '/inbound-message/' + id + '/message-validation-result/list', this.httpOptions);
}

/**
 * scroll one to many component messageValidationResult
 */
public scrollMessageValidationResult (id: number, form: ScrollForm<MessageValidationResultFilter, MessageValidationResultSorting>) {
return this.http.post<ScrollView<MessageValidationResultBasicView>>(environment.restApiUrl + '/inbound-message/' + id + '/message-validation-result/scroll', form, this.httpOptions);
}

/**
 * load one to many component messageValidationResult
 */
public loadMessageValidationResult(id: number) {
return this.http.get<MessageValidationResultFullView>(environment.restApiUrl + '/message-validation-result/' + id, this.httpOptions);
}

/**
 * create object
 */
public create() {
return this.http.get<InboundMessageFullView>(environment.restApiUrl + '/inbound-message/new');
}

/**
 * create one to many component messageValidationResult
 */
public createMessageValidationResult(id:number) {
return this.http.get<MessageValidationResultFullView>(environment.restApiUrl + '/inbound-message/' + id + '/message-validation-result/new', this.httpOptions);
}


/**
 * save object
 */
public save(form: InboundMessageForm) {
return this.http.post<number>(environment.restApiUrl + '/inbound-message', form, this.httpOptions);
}

/**
 * save one to many component messageValidationResult
 */
public saveMessageValidationResult(id:number, form: MessageValidationResultForm) {
return this.http.post<number>(environment.restApiUrl + '/inbound-message/' + id + '/message-validation-result', form, this.httpOptions);
}

/**
 * update object
 */
public update(id: number, form: InboundMessageForm) {
return this.http.put(environment.restApiUrl + '/inbound-message/' + id, form, this.httpOptions);
}

/**
 * update one to many component messageValidationResult
 */
public updateMessageValidationResult(id: number, form: MessageValidationResultForm) {
return this.http.put(environment.restApiUrl + '/message-validation-result/' + id, form, this.httpOptions);
}

/**
 * delete object
 */
public delete(id: number) {
return this.http.delete(environment.restApiUrl + '/inbound-message/' + id);
}

/**
 * delete one to many component messageValidationResult
 */
public deleteMessageValidationResult(id: number) {
return this.http.delete(environment.restApiUrl + '/message-validation-result/' + id);
}


/* Specific Code Start */
/* Specific Code End */

}
