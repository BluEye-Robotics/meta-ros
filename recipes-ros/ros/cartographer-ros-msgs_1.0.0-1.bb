DESCRIPTION = "ROS messages for the cartographer_ros package."
AUTHOR = "The Cartographer Authors"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "message-generation geometry-msgs std-msgs"

RDEPENDS_${PN} = "message-runtime"

SRC_URI = "https://github.com/ros-gbp/cartographer_ros-release/archive/release/melodic/cartographer_ros_msgs/1.0.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "91df7f941c95b31636bf7646108101f0"
SRC_URI[sha256sum] = "f4572cb110370abc6059493e41532e143142c3ee974c6737c6a42aa7811d11d4"

ROS_SPN = "cartographer_ros"
S = "${WORKDIR}/cartographer_ros-release-release-melodic-cartographer_ros_msgs-1.0.0-1"

inherit catkin
