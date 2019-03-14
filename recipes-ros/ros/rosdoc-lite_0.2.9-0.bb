DESCRIPTION = "This ROS package wraps documentation tools like doxygen, sphinx, and epydoc, making it convenient to generate ROS package documentation. It also generates online documentation for the ROS wiki."
AUTHOR = "Ken Conley"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "doxygen epydoc genmsg python-catkin-pkg python-kitchen python-rospkg python-sphinx python-pyyaml"

RDEPENDS_${PN} = "doxygen epydoc genmsg python-catkin-pkg python-kitchen python-rospkg python-sphinx python-pyyaml"

SRC_URI = "https://github.com/ros-gbp/rosdoc_lite-release/archive/release/melodic/rosdoc_lite/0.2.9-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "8dd1f2cae8577da7ffe827bcefe446b9"
SRC_URI[sha256sum] = "56baa614cb5b9b10171336c2a62470104cba4b85d16b8a4e952d1384fb4433ce"

S = "${WORKDIR}/rosdoc_lite-release-release-melodic-rosdoc_lite-0.2.9-0"

inherit catkin
