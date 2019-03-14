DESCRIPTION = "Provides conversions from PCL data types and ROS message types"
AUTHOR = "William Woodall"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "libeigen pcl pcl-msgs roscpp sensor-msgs std-msgs"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ros-gbp/perception_pcl-release/archive/release/melodic/pcl_conversions/1.6.2-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "c225ccdc7071b9d2e93ba76aa2ce8bb4"
SRC_URI[sha256sum] = "14361d15d63002d2752dff7618967181b18d3bb43aaee0c42ac6eb563d1a921a"

ROS_SPN = "perception_pcl"
S = "${WORKDIR}/perception_pcl-release-release-melodic-pcl_conversions-1.6.2-0"

inherit catkin
