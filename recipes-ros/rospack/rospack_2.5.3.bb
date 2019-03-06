DESCRIPTION = "ROS Package Tool"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "boost cmake-modules ${PYTHON_PN}-rospkg-native libtinyxml2"

SRC_URI = "https://github.com/ros/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "f95781d4169b2629c2157c740b3fbc67"
SRC_URI[sha256sum] = "6d3def4e56d351baab049550b41d4b452da3fa262ba1e2fdc8ec8173ebe0eebd"

inherit catkin

RDEPENDS_${PN} = "${PYTHON_PN}-rosdep \
                  ${@'python-subprocess' if d.getVar('PYTHON_PN', True) == 'python' else ''}"
