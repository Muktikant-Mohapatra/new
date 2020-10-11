import { Component, OnInit } from '@angular/core';
import {Task} from "../task.model";
import {TasksService} from "../tasks.service";

@Component({
  selector: 'app-tasks-list',
  templateUrl: './tasks-list.component.html',
  styleUrls: ['./tasks-list.component.css']
})
export class TasksListComponent implements OnInit {
  tasks: Task []=[];
  constructor(private taskService:TasksService) {

  }

  ngOnInit() {
      return this.taskService.getTasks().subscribe(
        (tasks:any[])=>{
          this.tasks=tasks
        },
        (error)=>console.log(error)
      );
  }

  public getDueDateLabel(task:Task){
    return task.completed ? 'label-success' : 'label-primary';
  }
  public taskOnChange(event,task){
    /*this.taskService.saveTask(task.event.target.checked).subscribe();*/
    console.log("task has changed");
  }
}
