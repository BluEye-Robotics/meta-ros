DESCRIPTION = "A collection of . mk include files for building ROS architectural elements. Most package authors should use cmake . mk, which calls CMake for the build of the package. The other files in this package are intended for use in exotic situations that mostly arise when importing 3rdparty code."
AUTHOR = "Morgan Quigley"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "rosbuild rospack"

RDEPENDS_${PN} = "rosbuild rospack"

SRC_URI = "https://github.com/ros-gbp/ros-release/archive/release/melodic/mk/1.14.5-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "953dfedc787a4400bf4858b285eb48cc"
SRC_URI[sha256sum] = "ada4f6ac0f6fe35bca9a4bf0e83794eb198cb02da00d08912fb8814fc0229f7a"

ROS_SPN = "ros"
S = "${WORKDIR}/ros-release-release-melodic-mk-1.14.5-0"

inherit catkin
