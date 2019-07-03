DESCRIPTION = "AprilTag detector library"
AUTHOR = "Edwin Olson"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = ""

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/AprilRobotics/apriltag-release/archive/release/melodic/apriltag/3.1.1-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "69e3d26f75c49a81a4cfe24338908ca4"
SRC_URI[sha256sum] = "99dbed4dcbf548582e54acc506bf55f4918c2fdf3a0682716b4a400074cb533c"

S = "${WORKDIR}/apriltag-release-release-melodic-apriltag-3.1.1-1"

inherit catkin
