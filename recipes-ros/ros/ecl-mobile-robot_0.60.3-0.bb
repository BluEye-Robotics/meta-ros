DESCRIPTION = "Contains transforms (e. g. differential drive inverse kinematics) for the various types of mobile robot platforms."
AUTHOR = "Daniel Stonier"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "ecl-build ecl-license ecl-errors ecl-geometry ecl-math ecl-formatters ecl-linear-algebra ecl-build ecl-license ecl-errors ecl-geometry ecl-math ecl-formatters ecl-linear-algebra"

RDEPENDS_${PN} = "ecl-build ecl-license ecl-errors ecl-geometry ecl-math ecl-formatters ecl-linear-algebra"

SRC_URI = "https://github.com/yujinrobot-release/ecl_navigation-release/archive/release/melodic/ecl_mobile_robot/0.60.3-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "0139bb5e86b14e6a2133f112d564bfec"
SRC_URI[sha256sum] = "b90849f51b703d6d5c3b246161ad8679bf14b8a27865ae175e9c945fe9edf31e"

ROS_SPN = "ecl_navigation"
S = "${WORKDIR}/ecl_navigation-release-release-melodic-ecl_mobile_robot-0.60.3-0"

inherit catkin
