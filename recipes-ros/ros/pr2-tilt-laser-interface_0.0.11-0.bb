DESCRIPTION = "Provides a set of tools/actions for manipulating the pr2's tilting laser. Simplifies previously complex tasks, such as fetching a single sweep, given a set of desired parameters for both the laser driver and tilting platform."
AUTHOR = "Radu Rusu"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=17;endline=17;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roscpp actionlib actionlib-msgs sensor-msgs pr2-msgs laser-geometry pcl-ros pcl-conversions libeigen message-generation roscpp actionlib actionlib-msgs sensor-msgs pr2-msgs laser-geometry pcl-ros pcl-conversions libeigen message-runtime"

RDEPENDS_${PN} = "roscpp actionlib actionlib-msgs sensor-msgs pr2-msgs laser-geometry pcl-ros pcl-conversions libeigen message-runtime"

SRC_URI = "https://github.com/pr2-gbp/pr2_common_actions-release/archive/release/melodic/pr2_tilt_laser_interface/0.0.11-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "2c0f27a222e00726c9b9024f00aa8784"
SRC_URI[sha256sum] = "8d25bddf370f8550b5ddac3e38c98c17d4880893c20bc601f8fd8b86c5bc4c2c"

ROS_SPN = "pr2_common_actions"
S = "${WORKDIR}/pr2_common_actions-release-release-melodic-pr2_tilt_laser_interface-0.0.11-0"

inherit catkin
