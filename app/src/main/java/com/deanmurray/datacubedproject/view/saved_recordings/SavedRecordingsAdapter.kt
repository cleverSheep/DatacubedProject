@file:Suppress("PropertyName")

package com.deanmurray.datacubedproject.view.saved_recordings

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.deanmurray.datacubedproject.R
import com.deanmurray.datacubedproject.model.Recording

class SavedRecordingsAdapter(private val recording_list: ArrayList<Recording>) :
    RecyclerView.Adapter<SavedRecordingsAdapter.RecordingViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecordingViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.view_saved_recording, parent, false)
        return RecordingViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecordingViewHolder, position: Int) {
        holder.apply {
            recording_name.text = recording_list[position].recording_name
            recording_duration.text = recording_list[position].recording_duration.toString()
            recording_time.text = recording_list[position].recording_time.toString()
        }
    }

    override fun getItemCount(): Int = recording_list.size

    class RecordingViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val recording_name: TextView = itemView.findViewById(R.id.recording_name) as TextView
        val recording_duration: TextView =
            itemView.findViewById(R.id.recording_duration) as TextView
        val recording_time: TextView = itemView.findViewById(R.id.recording_time) as TextView
    }

}