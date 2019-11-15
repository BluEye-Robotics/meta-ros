DESCRIPTION = "Provides conversions from PCL data types and ROS message types"
AUTHOR = "William Woodall"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "libeigen pcl pcl-msgs roscpp sensor-msgs std-msgs"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ros-gbp/perception_pcl-release/archive/release/melodic/pcl_conversions/1.7.0-2.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "2d4e7c4dd6cb8ccfa498af067aa75444"
SRC_URI[sha256sum] = "3e7994bc21f63d0a4f4de8475c70bd018cccbe17cf7fa797bc746ebeeb9337ef"

ROS_SPN = "perception_pcl"
S = "${WORKDIR}/perception_pcl-release-release-melodic-pcl_conversions-1.7.0-2"

inherit catkin
