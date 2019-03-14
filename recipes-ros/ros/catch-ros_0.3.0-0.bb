DESCRIPTION = "ROS integration for the Catch unit test framework"
AUTHOR = "Max Schwarz"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=5;endline=5;md5=75730354549103aaba72b66caf53717b"

DEPENDS = "roscpp"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/AIS-Bonn/catch_ros-release/archive/release/melodic/catch_ros/0.3.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "2d1b7e1073a753378982f07cce405957"
SRC_URI[sha256sum] = "186ec627d219a896f681446242ce546c8595429ac4f058fab5ac4aebec4f261b"

S = "${WORKDIR}/catch_ros-release-release-melodic-catch_ros-0.3.0-0"

inherit catkin
