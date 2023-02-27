import { Component } from '@angular/core';
import { TransferService } from '../transfer.service';

@Component({
  selector: 'app-transfer-form',
  templateUrl: './transfer-form.component.html',
  styleUrls: ['./transfer-form.component.css']
})
export class TransferFormComponent {

  fromAccount: string = ''
  toAccount: string = ''
  amount: number = 0

  constructor(private transferService: TransferService) { }

  handleSubmit(event: Event) {
    event.preventDefault();
  }

}
