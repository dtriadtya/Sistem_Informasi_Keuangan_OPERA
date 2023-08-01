SELECT
     pemasukkan.`no_anggota` AS pemasukkan_no_anggota,
     pemasukkan.`nama_anggota` AS pemasukkan_nama_anggota,
     pemasukkan.`nominal_pemasukkan` AS pemasukkan_nominal_pemasukkan,
     pemasukkan.`tgl_pemasukkan` AS pemasukkan_tgl_pemasukkan
FROM
     `pemasukkan` pemasukkan