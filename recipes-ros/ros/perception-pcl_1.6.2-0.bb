DESCRIPTION = "PCL (Point Cloud Library) ROS interface stack. PCL-ROS is the preferred bridge for 3D applications involving n-D Point Clouds and 3D geometry processing in ROS."
AUTHOR = "Open Perception"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=17;endline=17;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = ""

RDEPENDS_${PN} = "pcl-conversions pcl-msgs pcl-ros"

SRC_URI = "https://github.com/ros-gbp/perception_pcl-release/archive/release/melodic/perception_pcl/1.6.2-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "df4db256bee2dda65176dca9eb6dfb53"
SRC_URI[sha256sum] = "05249c482602e692fdbcc13a26ed22ac2b0de79d93c08661ec8bcd0b87b6f3ad"

S = "${WORKDIR}/perception_pcl-release-release-melodic-perception_pcl-1.6.2-0"

inherit catkin
