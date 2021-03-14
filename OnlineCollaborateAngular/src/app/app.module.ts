import { BrowserModule } from '@angular/platform-browser';
import { CommonModule } from '@angular/common';
import { NgModule } from '@angular/core';
import { DataTablesModule } from 'angular-datatables';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { RegisterUserComponent } from '../../../OnlineCollaborateAngular/src/app/register-user/register-user.component';
import { UserListComponent } from '../../../OnlineCollaborateAngular/src/app/user-list/user-list.component';
import { LoginUserComponent } from './login-user/login-user.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { ActiveUserComponent } from './active-user/active-user.component'; 

@NgModule({
  declarations: [
    AppComponent,
    RegisterUserComponent,
    UserListComponent,
    LoginUserComponent,
    ActiveUserComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,  
    ReactiveFormsModule,  
    HttpClientModule,
    DataTablesModule,
    CommonModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
