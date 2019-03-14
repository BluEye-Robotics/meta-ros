DESCRIPTION = "tf2 is the second generation of the transform library, which lets the user keep track of multiple coordinate frames over time. tf2 maintains the relationship between coordinate frames in a tree structure buffered in time, and lets the user transform points, vectors, etc between any two coordinate frames at any desired point in time."
AUTHOR = "Tully Foote"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=16;endline=16;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "console-bridge geometry-msgs rostime tf2-msgs console-bridge geometry-msgs rostime tf2-msgs"

RDEPENDS_${PN} = "console-bridge geometry-msgs rostime tf2-msgs"

SRC_URI = "https://github.com/ros-gbp/geometry2-release/archive/release/melodic/tf2/0.6.5-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "6a9999cffd82fc9f506ac16076a1428d"
SRC_URI[sha256sum] = "f6776b600f397998cef387bfa57b6ad3e1e396f7a0015521ba7389ce2ca211c4"

ROS_SPN = "geometry2"
S = "${WORKDIR}/geometry2-release-release-melodic-tf2-0.6.5-0"

inherit catkin
