DESCRIPTION = "swri_profiler provides basic tools for real-time selective profiling of ROS C++ nodes."
AUTHOR = ""
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "diagnostic-updater roscpp rospy std-msgs swri-profiler-msgs"

RDEPENDS_${PN} = "rosbridge-server"

SRC_URI = "https://github.com/swri-robotics-gbp/swri_profiler-release/archive/release/melodic/swri_profiler/0.2.2-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "4a8337b8a622b7b1a94370fdc7c28b4e"
SRC_URI[sha256sum] = "5fc011fc3d5f908f7e6e3accbf3dd2e73634416dfefa2d412495d18f0efbea67"

S = "${WORKDIR}/swri_profiler-release-release-melodic-swri_profiler-0.2.2-1"

inherit catkin
