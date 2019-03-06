SRC_URI = "https://github.com/ros/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "267bc4d901ce9344ae46f82abdfc4924"
SRC_URI[sha256sum] = "6fb2cfb7ec7db0512cd0e43634328aa6474fc15005e51279d2926d9246f02afc"

S = "${WORKDIR}/${ROS_SP}/${ROS_BPN}"

inherit catkin

ROS_SPN = "roscpp_core"
