import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { UserListComponent } from '../../../OnlineCollaborateAngular/src/app/user-list/user-list.component';  
import { LoginUserComponent } from './login-user/login-user.component';
import { RegisterUserComponent } from '../../../OnlineCollaborateAngular/src/app/register-user/register-user.component';

const routes: Routes = [
  { path: '', redirectTo: 'login-user', pathMatch: 'full' },  
  { path: 'user-list', component: UserListComponent },  
  { path: 'add-user', component: RegisterUserComponent },
  { path: 'login-user', component: LoginUserComponent },  
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
