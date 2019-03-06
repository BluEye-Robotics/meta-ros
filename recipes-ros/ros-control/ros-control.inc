SRC_URI = "https://github.com/ros-controls/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "cb83b48f22a6695114ff11a7ca2b4dcb"
SRC_URI[sha256sum] = "adf1a9d1fd10f4d89e91c8279d1278d9cd301767b658c143810479b2d10eedca"

S = "${WORKDIR}/${ROS_SP}/${ROS_BPN}"

inherit catkin

ROS_SPN = "ros_control"
