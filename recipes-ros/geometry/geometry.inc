SRC_URI = "https://github.com/ros/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "5c1240ca612ce71f3d3d66c76fefeedc"
SRC_URI[sha256sum] = "61a278bdd50e00ea442055d9f70eaf82b5a36916739edca188fa1b71a59507b4"

S = "${WORKDIR}/${ROS_SP}/${ROS_BPN}"

inherit catkin

ROS_SPN = "geometry"
