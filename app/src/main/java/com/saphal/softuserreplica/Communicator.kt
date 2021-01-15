package com.saphal.softuserreplica

import com.saphal.softuserreplica.model.Student

interface Communicator {
    fun passData(lstStd: ArrayList<Student>)
}