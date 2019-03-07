DESCRIPTION = "Provides nodes to assemble point clouds from either LaserScan or PointCloud messages"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "message-generation sensor-msgs message-filters tf roscpp filters laser-geometry pluginlib"

SRC_URI = "https://github.com/ros-perception/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI += "file://0001-Remove-boost-signals.patch"
SRC_URI[md5sum] = "cff0649edf7fd30c5d8a7dbb95e9c73a"
SRC_URI[sha256sum] = "f9b5c23f7eac7406dd3d0e4a095864335b18a25611fd28f3279763339d7bd94f"

S = "${WORKDIR}/${ROS_SP}"

inherit catkin
