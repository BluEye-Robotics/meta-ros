SRC_URI = "https://github.com/ros/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "4ff550882cbfc98f2978b9ae30b84559"
SRC_URI[sha256sum] = "d1442039ca31af8eaa36088a681a24e59654d221d65924b7e46e731ff2baeeef"

ROS_PKG_SUBDIR ?= ""
S = "${WORKDIR}/${ROS_SP}/${ROS_PKG_SUBDIR}/${ROS_BPN}"

inherit catkin

ROS_SPN = "ros"
