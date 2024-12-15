

package com.example.database.ui.costumwidget

import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.material3.IconButton

@Composable
fun TopAppBar(
    onBack: () -> Unit,
    showBackButton: Boolean = true,
    judul: String,
    modifier: Modifier = Modifier,
    rightActionIcon: ImageVector? = null,
    onRightActionClick: (() -> Unit)? = null
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(16.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        // Tombol kembali jika `showBackButton` diaktifkan
        if (showBackButton) {
            IconButton(onClick = onBack) {
                Icon(
                    imageVector = androidx.compose.material.icons.Icons.Default.ArrowBack,
                    contentDescription = "Kembali"
                )
            }
        } else {
            Spacer(modifier = Modifier.width(48.dp)) // Tambahkan ruang jika tombol tidak ada
        }

        // Spacer untuk memastikan judul berada di tengah
        Spacer(modifier = Modifier.weight(1f))

        // Judul di tengah
        Text(
            text = judul,
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.align(Alignment.CenterVertically)
        )

        // Spacer untuk keseimbangan
        Spacer(modifier = Modifier.weight(1f))

        // Ikon aksi di sisi kanan (opsional)
        if (rightActionIcon != null && onRightActionClick != null) {
            IconButton(onClick = onRightActionClick) {
                Icon(
                    imageVector = rightActionIcon,
                    contentDescription = "Aksi"
                )
            }
        } else {
            Spacer(modifier = Modifier.width(48.dp)) // Tambahkan ruang jika ikon tidak ada
        }
    }
}
