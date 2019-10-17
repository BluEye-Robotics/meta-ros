DESCRIPTION = "Converts a 3D Point Cloud into a 2D laser scan. This is useful for making devices like the Kinect appear like a laser scanner for 2D-based algorithms (e. g. laser-based SLAM)."
AUTHOR = "Paul Bovbel"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=01c2bc31767ccb3a68e12f02612b2a97"

DEPENDS = "laser-geometry message-filters nodelet roscpp sensor-msgs tf2 tf2-ros tf2-sensor-msgs"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ros-gbp/pointcloud_to_laserscan-release/archive/release/melodic/pointcloud_to_laserscan/1.4.1-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "cdd680414179467ed56230e1a065ef17"
SRC_URI[sha256sum] = "50bebd62ff6e696bde5dd47a8787709a756d894d6826615b8cbbc54abe7edce4"

S = "${WORKDIR}/pointcloud_to_laserscan-release-release-melodic-pointcloud_to_laserscan-1.4.1-1"

inherit catkin
