DESCRIPTION = "Converts a 3D Point Cloud into a 2D laser scan. This is useful for making devices like the Kinect appear like a laser scanner for 2D-based algorithms (e. g. laser-based SLAM)."
AUTHOR = "Paul Bovbel"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=01c2bc31767ccb3a68e12f02612b2a97"

DEPENDS = "message-filters nodelet roscpp sensor-msgs tf2 tf2-ros tf2-sensor-msgs"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ros-gbp/pointcloud_to_laserscan-release/archive/release/melodic/pointcloud_to_laserscan/1.4.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "bfa32a716cdcdd2ea68d8c46aa469ca2"
SRC_URI[sha256sum] = "58e4c4ce3d73beaebecfda86a761f17d4680cad274ab57d361ab9bdfe726b29c"

S = "${WORKDIR}/pointcloud_to_laserscan-release-release-melodic-pointcloud_to_laserscan-1.4.0-0"

inherit catkin
