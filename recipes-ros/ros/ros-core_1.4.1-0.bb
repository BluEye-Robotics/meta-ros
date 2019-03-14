DESCRIPTION = "A metapackage to aggregate the packages required to use publish / subscribe, services, launch files, and other core ROS concepts."
AUTHOR = "Dirk Thomas"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = ""

RDEPENDS_${PN} = "catkin class-loader cmake-modules common-msgs gencpp geneus genlisp genmsg gennodejs genpy message-generation message-runtime pluginlib ros ros-comm rosbag-migration-rule rosconsole rosconsole-bridge roscpp-core rosgraph-msgs  rospack std-msgs std-srvs"

SRC_URI = "https://github.com/ros-gbp/metapackages-release/archive/release/melodic/ros_core/1.4.1-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "7a41b6c7778f0716cfe3d67aa6378c87"
SRC_URI[sha256sum] = "390d24da9397fce3a11f1dc7a0a23fb0886b81a4cfd2473906508358a670782d"

ROS_SPN = "metapackages"
S = "${WORKDIR}/metapackages-release-release-melodic-ros_core-1.4.1-0"

inherit catkin
