DESCRIPTION = "The odom_frame_publisher package"
AUTHOR = ""
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "geometry-msgs roscpp tf2 tf2-ros tf2-msgs tf2-geometry-msgs quaternion-operation libeigen geometry-msgs roscpp tf2 tf2-ros tf2-msgs tf2-geometry-msgs quaternion-operation libeigen"

RDEPENDS_${PN} = "geometry-msgs roscpp tf2 tf2-ros tf2-msgs tf2-geometry-msgs quaternion-operation libeigen rosdoc-lite"

SRC_URI = "https://github.com/OUXT-Polaris/odom_frame_publisher-release/archive/release/melodic/odom_frame_publisher/0.0.1-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "0414ae4de06635508e61d99f001e267a"
SRC_URI[sha256sum] = "e91bd51c0e7df5c5f225d5957d58d33125ad5393b1e457b1f2ee677b67ebb674"

S = "${WORKDIR}/odom_frame_publisher-release-release-melodic-odom_frame_publisher-0.0.1-1"

inherit catkin
