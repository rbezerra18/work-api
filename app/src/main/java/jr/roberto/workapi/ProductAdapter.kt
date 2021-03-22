package jr.roberto.workapi

import android.content.Context
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import jr.roberto.workapi.model.Product

class ProductAdapter(private val context: Context,
                     private val productList: List<Product>
                     ): RecyclerView.Adapter<ProductViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

}

class ProductViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

}