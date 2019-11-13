DESCRIPTION = "Implementation of warehouse_ros for MongoDB"
AUTHOR = "Bhaskara Marthi"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "libmongoclient-dev warehouse-ros roscpp rostime std-msgs class-loader"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ros-gbp/warehouse_ros_mongo-release/archive/release/melodic/warehouse_ros_mongo/0.9.1-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "66d120ae0d9360f6f5bbabed2d86a1c5"
SRC_URI[sha256sum] = "1f15415042722592c69f4f302de48f61bd3df7a55b7cf6af2501fea70900b2a8"

S = "${WORKDIR}/warehouse_ros_mongo-release-release-melodic-warehouse_ros_mongo-0.9.1-1"

inherit catkin
