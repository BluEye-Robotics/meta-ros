DESCRIPTION = "Persistent storage of ROS messages"
AUTHOR = "Bhaskara Marthi"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roscpp rostime std-msgs geometry-msgs pluginlib tf boost roscpp rostime std-msgs geometry-msgs pluginlib tf"

RDEPENDS_${PN} = "boost roscpp rostime std-msgs geometry-msgs pluginlib tf"

SRC_URI = "https://github.com/ros-gbp/warehouse_ros-release/archive/release/melodic/warehouse_ros/0.9.3-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "b53eea92d3b53d8503711a3cd34050d1"
SRC_URI[sha256sum] = "9bc798170ca3d679ac4f4bf3b5db4fa7d748397c9262be0a2373085a18b051ce"

S = "${WORKDIR}/warehouse_ros-release-release-melodic-warehouse_ros-0.9.3-1"

inherit catkin
