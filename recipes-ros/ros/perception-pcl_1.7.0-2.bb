DESCRIPTION = "PCL (Point Cloud Library) ROS interface stack. PCL-ROS is the preferred bridge for 3D applications involving n-D Point Clouds and 3D geometry processing in ROS."
AUTHOR = "Open Perception"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=17;endline=17;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = ""

RDEPENDS_${PN} = "pcl-conversions pcl-msgs pcl-ros"

SRC_URI = "https://github.com/ros-gbp/perception_pcl-release/archive/release/melodic/perception_pcl/1.7.0-2.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "219d07aabcae58e3ea7bc0a88793cd47"
SRC_URI[sha256sum] = "8d884831c2fe71ec25a5b74158ae50b4cd3a9c4a1694bc0271c7fa8eac87685b"

S = "${WORKDIR}/perception_pcl-release-release-melodic-perception_pcl-1.7.0-2"

inherit catkin
