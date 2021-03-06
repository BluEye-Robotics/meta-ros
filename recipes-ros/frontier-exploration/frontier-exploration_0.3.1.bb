DESCRIPTION = "Frontier exploration implementation in ROS, \
accepts exploration goals via actionlib, sends movement commands to move_base"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "geometry-msgs roscpp pcl costmap-2d actionlib move-base-msgs visualization-msgs tf"

SRC_URI = "https://github.com/paulbovbel/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "d5228bc8eb40a0644b50a1995ab80b05"
SRC_URI[sha256sum] = "29fab20fbaf3a71d8e076209bbfb654419d4bce43ece68a86e05a675ed736c5d"

S = "${WORKDIR}/${ROS_SP}"

inherit catkin

RRECOMMENDS_${PN} = "costmap-2d actionlib move-base tf"
