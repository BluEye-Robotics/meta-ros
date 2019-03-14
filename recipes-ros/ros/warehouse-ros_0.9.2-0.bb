DESCRIPTION = "Persistent storage of ROS messages"
AUTHOR = "Bhaskara Marthi"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roscpp rostime std-msgs geometry-msgs pluginlib tf boost roscpp rostime std-msgs geometry-msgs pluginlib tf"

RDEPENDS_${PN} = "boost roscpp rostime std-msgs geometry-msgs pluginlib tf"

SRC_URI = "https://github.com/ros-gbp/warehouse_ros-release/archive/release/melodic/warehouse_ros/0.9.2-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "022b26e6247ea69f56bc33497cb921f7"
SRC_URI[sha256sum] = "8e5fa9db4aea56c8bebc4514900b75d2f8bfdeb3d7ae664b4f991273f59b4dfe"

S = "${WORKDIR}/warehouse_ros-release-release-melodic-warehouse_ros-0.9.2-0"

inherit catkin
