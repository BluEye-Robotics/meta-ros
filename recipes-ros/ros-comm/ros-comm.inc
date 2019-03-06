SRC_URI = "https://github.com/ros/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "d7bf3e15caa4379c279fd7a8aa631604"
SRC_URI[sha256sum] = "3e49bef96b8a0f9684e5c4f1736d171e9c8842a3979d5d3c6442b53698e8167f"

ROS_PKG_SUBDIR ?= ""
S = "${WORKDIR}/${ROS_SP}/${ROS_PKG_SUBDIR}/${ROS_BPN}"

inherit catkin

ROS_SPN = "ros_comm"
