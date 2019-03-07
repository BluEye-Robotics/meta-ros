SRC_URI = "https://github.com/ros/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "dd1f5e3cd7d500f628df574bd2e736d4"
SRC_URI[sha256sum] = "024adbb7279fe0be8a0242bf8cb4987d2b07ae19f61653a37a9a68fb7d5b23c9"

S = "${WORKDIR}/${ROS_SP}/${ROS_BPN}"

inherit catkin
