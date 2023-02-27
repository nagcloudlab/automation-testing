import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { CalculatorComponent } from './calculator/calculator.component';
import { StatementComponent } from './statement/statement.component';
import { TransferFormComponent } from './transfer-form/transfer-form.component';

const routes: Routes = [
  { path: "calculator", component: CalculatorComponent },
  { path: "transfer", component: TransferFormComponent },
  { path: "statement", component: StatementComponent },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
