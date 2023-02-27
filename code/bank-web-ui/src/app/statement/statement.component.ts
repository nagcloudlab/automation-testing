import { Component } from '@angular/core';
import { StatementService } from '../statement.service';

@Component({
  selector: 'app-statement',
  templateUrl: './statement.component.html',
  styleUrls: ['./statement.component.css']
})
export class StatementComponent {

  constructor(private statementService: StatementService) { }



}
